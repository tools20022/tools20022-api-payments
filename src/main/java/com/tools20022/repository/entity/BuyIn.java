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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
 * BuyIn.mmSecuritiesCompensation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmBuyinDate
 * BuyIn.mmBuyinDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
 * BuyIn.mmBuyInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmFees BuyIn.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
 * BuyIn.mmCashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#mmRelatedSecuritiesClearingProcess
 * BuyIn.mmRelatedSecuritiesClearingProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedBuyIn
 * SecuritiesPricing.mmRelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceBuyIn
 * PaymentObligation.mmPaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedBuyIn
 * SecuritiesQuantity.mmRelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmBuyIn
 * SecuritiesClearing.mmBuyIn}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesCompensation;
	/**
	 * Securities bought in a buy-in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedBuyIn
	 * SecuritiesQuantity.mmRelatedBuyIn}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesCompensation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCompensation";
			definition = "Securities bought in a buy-in process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ISODate buyinDate;
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
	public static final MMBusinessAttribute mmBuyinDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyinDate";
			definition = "Date at which the buy-in occurs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyIn.class.getMethod("getBuyinDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> buyInPrice;
	/**
	 * Provides the price of the buy-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedBuyIn
	 * SecuritiesPricing.mmRelatedBuyIn}</li>
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
	public static final MMBusinessAssociationEnd mmBuyInPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyInPrice";
			definition = "Provides the price of the buy-in.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount fees;
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
	public static final MMBusinessAttribute mmFees = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to a cash compensation or to a securities compensation in a buy-in process";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyIn.class.getMethod("getFees", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> cashCompensation;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceBuyIn
	 * PaymentObligation.mmPaymentSourceBuyIn}</li>
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
	public static final MMBusinessAssociationEnd mmCashCompensation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashCompensation";
			definition = "In case securities are not available to be bought-in by the buyer/CCP, a cash compensation is required from the seller. It is derived from the association ResultingObligation between ObligationFulfillment and Obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected SecuritiesClearing relatedSecuritiesClearingProcess;
	/**
	 * Clearing process which includes the buy-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmBuyIn
	 * SecuritiesClearing.mmBuyIn}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the buy-in.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn";
				definition = "Process in which the buyer/CCP repurchases shares of stock because the seller either failed to deliver the shares or did not deliver them in a timely fashion. The seller has to make up the price difference if the new shares are more expensive than originally agreed to.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedBuyIn, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedBuyIn, com.tools20022.repository.entity.SecuritiesClearing.mmBuyIn);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyIn.mmSecuritiesCompensation, com.tools20022.repository.entity.BuyIn.mmBuyinDate, com.tools20022.repository.entity.BuyIn.mmBuyInPrice,
						com.tools20022.repository.entity.BuyIn.mmFees, com.tools20022.repository.entity.BuyIn.mmCashCompensation, com.tools20022.repository.entity.BuyIn.mmRelatedSecuritiesClearingProcess);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BuyIn.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesQuantity> getSecuritiesCompensation() {
		return securitiesCompensation;
	}

	public void setSecuritiesCompensation(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesCompensation) {
		this.securitiesCompensation = securitiesCompensation;
	}

	public ISODate getBuyinDate() {
		return buyinDate;
	}

	public void setBuyinDate(ISODate buyinDate) {
		this.buyinDate = buyinDate;
	}

	public List<SecuritiesPricing> getBuyInPrice() {
		return buyInPrice;
	}

	public void setBuyInPrice(List<com.tools20022.repository.entity.SecuritiesPricing> buyInPrice) {
		this.buyInPrice = buyInPrice;
	}

	public ActiveCurrencyAndAmount getFees() {
		return fees;
	}

	public void setFees(ActiveCurrencyAndAmount fees) {
		this.fees = fees;
	}

	public List<PaymentObligation> getCashCompensation() {
		return cashCompensation;
	}

	public void setCashCompensation(List<com.tools20022.repository.entity.PaymentObligation> cashCompensation) {
		this.cashCompensation = cashCompensation;
	}

	public SecuritiesClearing getRelatedSecuritiesClearingProcess() {
		return relatedSecuritiesClearingProcess;
	}

	public void setRelatedSecuritiesClearingProcess(com.tools20022.repository.entity.SecuritiesClearing relatedSecuritiesClearingProcess) {
		this.relatedSecuritiesClearingProcess = relatedSecuritiesClearingProcess;
	}
}