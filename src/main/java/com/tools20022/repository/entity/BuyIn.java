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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process in which the buyer/CCP repurchases shares of stock because the seller
 * either failed to deliver the shares or did not deliver them in a timely
 * fashion. The seller has to make up the price difference if the new shares are
 * more expensive than originally agreed to.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BuyIn" src="doc-files/BuyIn.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#SecuritiesCompensation
 * BuyIn.SecuritiesCompensation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#BuyinDate
 * BuyIn.BuyinDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#BuyInPrice
 * BuyIn.BuyInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#Fees BuyIn.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#CashCompensation
 * BuyIn.CashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#RelatedSecuritiesClearingProcess
 * BuyIn.RelatedSecuritiesClearingProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedBuyIn
 * SecuritiesPricing.RelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceBuyIn
 * PaymentObligation.PaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedBuyIn
 * SecuritiesQuantity.RelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesClearing#BuyIn
 * SecuritiesClearing.BuyIn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
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
 * "BuyIn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process in which the buyer/CCP repurchases shares of stock because the seller either failed to deliver the shares or did not deliver them in a timely fashion. The seller has to make up the price difference if the new shares are more expensive than originally agreed to."
 * </li>
 * </ul>
 */
public class BuyIn extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities bought in a buy-in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedBuyIn
	 * SecuritiesQuantity.RelatedBuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities bought in a buy-in process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesCompensation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCompensation";
			definition = "Securities bought in a buy-in process.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the buy-in occurs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyinDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the buy-in occurs."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuyinDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyinDate";
			definition = "Date at which the buy-in occurs.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Provides the price of the buy-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedBuyIn
	 * SecuritiesPricing.RelatedBuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the price of the buy-in."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BuyInPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyInPrice";
			definition = "Provides the price of the buy-in.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fees related to a cash compensation or to a securities compensation in a
	 * buy-in process
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees related to a cash compensation or to a securities compensation in a buy-in process"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Fees = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to a cash compensation or to a securities compensation in a buy-in process";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * In case securities are not available to be bought-in by the buyer/CCP, a
	 * cash compensation is required from the seller. It is derived from the
	 * association ResultingObligation between ObligationFulfillment and
	 * Obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceBuyIn
	 * PaymentObligation.PaymentSourceBuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case securities are not available to be bought-in by the buyer/CCP, a cash compensation is required from the seller. It is derived from the association ResultingObligation between ObligationFulfillment and Obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashCompensation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashCompensation";
			definition = "In case securities are not available to be bought-in by the buyer/CCP, a cash compensation is required from the seller. It is derived from the association ResultingObligation between ObligationFulfillment and Obligation.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing process which includes the buy-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#BuyIn
	 * SecuritiesClearing.BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BuyIn
	 * BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesClearingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process which includes the buy-in."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyIn.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the buy-in.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesClearing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.BuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BuyIn";
				definition = "Process in which the buyer/CCP repurchases shares of stock because the seller either failed to deliver the shares or did not deliver them in a timely fashion. The seller has to make up the price difference if the new shares are more expensive than originally agreed to.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn, com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn, com.tools20022.repository.entity.SecuritiesClearing.BuyIn);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyIn.SecuritiesCompensation, com.tools20022.repository.entity.BuyIn.BuyinDate, com.tools20022.repository.entity.BuyIn.BuyInPrice,
						com.tools20022.repository.entity.BuyIn.Fees, com.tools20022.repository.entity.BuyIn.CashCompensation, com.tools20022.repository.entity.BuyIn.RelatedSecuritiesClearingProcess);
			}
		});
		return mmObject_lazy.get();
	}
}