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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
	protected List<SecuritiesQuantity> securitiesCompensation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyIn, List<SecuritiesQuantity>> mmSecuritiesCompensation = new MMBusinessAssociationEnd<BuyIn, List<SecuritiesQuantity>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCompensation";
			definition = "Securities bought in a buy-in process.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(BuyIn obj) {
			return obj.getSecuritiesCompensation();
		}

		@Override
		public void setValue(BuyIn obj, List<SecuritiesQuantity> value) {
			obj.setSecuritiesCompensation(value);
		}
	};
	protected ISODate buyinDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BuyIn, ISODate> mmBuyinDate = new MMBusinessAttribute<BuyIn, ISODate>() {
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

		@Override
		public ISODate getValue(BuyIn obj) {
			return obj.getBuyinDate();
		}

		@Override
		public void setValue(BuyIn obj, ISODate value) {
			obj.setBuyinDate(value);
		}
	};
	protected List<SecuritiesPricing> buyInPrice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyIn, List<SecuritiesPricing>> mmBuyInPrice = new MMBusinessAssociationEnd<BuyIn, List<SecuritiesPricing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyInPrice";
			definition = "Provides the price of the buy-in.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmRelatedBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public List<SecuritiesPricing> getValue(BuyIn obj) {
			return obj.getBuyInPrice();
		}

		@Override
		public void setValue(BuyIn obj, List<SecuritiesPricing> value) {
			obj.setBuyInPrice(value);
		}
	};
	protected ActiveCurrencyAndAmount fees;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BuyIn, ActiveCurrencyAndAmount> mmFees = new MMBusinessAttribute<BuyIn, ActiveCurrencyAndAmount>() {
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

		@Override
		public ActiveCurrencyAndAmount getValue(BuyIn obj) {
			return obj.getFees();
		}

		@Override
		public void setValue(BuyIn obj, ActiveCurrencyAndAmount value) {
			obj.setFees(value);
		}
	};
	protected List<PaymentObligation> cashCompensation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyIn, List<PaymentObligation>> mmCashCompensation = new MMBusinessAssociationEnd<BuyIn, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashCompensation";
			definition = "In case securities are not available to be bought-in by the buyer/CCP, a cash compensation is required from the seller. It is derived from the association ResultingObligation between ObligationFulfillment and Obligation.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmPaymentSourceBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(BuyIn obj) {
			return obj.getCashCompensation();
		}

		@Override
		public void setValue(BuyIn obj, List<PaymentObligation> value) {
			obj.setCashCompensation(value);
		}
	};
	protected SecuritiesClearing relatedSecuritiesClearingProcess;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyIn, Optional<SecuritiesClearing>> mmRelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd<BuyIn, Optional<SecuritiesClearing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the buy-in.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesClearing.mmBuyIn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesClearing.mmObject();
		}

		@Override
		public Optional<SecuritiesClearing> getValue(BuyIn obj) {
			return obj.getRelatedSecuritiesClearingProcess();
		}

		@Override
		public void setValue(BuyIn obj, Optional<SecuritiesClearing> value) {
			obj.setRelatedSecuritiesClearingProcess(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn";
				definition = "Process in which the buyer/CCP repurchases shares of stock because the seller either failed to deliver the shares or did not deliver them in a timely fashion. The seller has to make up the price difference if the new shares are more expensive than originally agreed to.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmRelatedBuyIn, PaymentObligation.mmPaymentSourceBuyIn, SecuritiesQuantity.mmRelatedBuyIn, SecuritiesClearing.mmBuyIn);
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
		return securitiesCompensation == null ? securitiesCompensation = new ArrayList<>() : securitiesCompensation;
	}

	public BuyIn setSecuritiesCompensation(List<SecuritiesQuantity> securitiesCompensation) {
		this.securitiesCompensation = Objects.requireNonNull(securitiesCompensation);
		return this;
	}

	public ISODate getBuyinDate() {
		return buyinDate;
	}

	public BuyIn setBuyinDate(ISODate buyinDate) {
		this.buyinDate = Objects.requireNonNull(buyinDate);
		return this;
	}

	public List<SecuritiesPricing> getBuyInPrice() {
		return buyInPrice == null ? buyInPrice = new ArrayList<>() : buyInPrice;
	}

	public BuyIn setBuyInPrice(List<SecuritiesPricing> buyInPrice) {
		this.buyInPrice = Objects.requireNonNull(buyInPrice);
		return this;
	}

	public ActiveCurrencyAndAmount getFees() {
		return fees;
	}

	public BuyIn setFees(ActiveCurrencyAndAmount fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<PaymentObligation> getCashCompensation() {
		return cashCompensation == null ? cashCompensation = new ArrayList<>() : cashCompensation;
	}

	public BuyIn setCashCompensation(List<PaymentObligation> cashCompensation) {
		this.cashCompensation = Objects.requireNonNull(cashCompensation);
		return this;
	}

	public Optional<SecuritiesClearing> getRelatedSecuritiesClearingProcess() {
		return relatedSecuritiesClearingProcess == null ? Optional.empty() : Optional.of(relatedSecuritiesClearingProcess);
	}

	public BuyIn setRelatedSecuritiesClearingProcess(SecuritiesClearing relatedSecuritiesClearingProcess) {
		this.relatedSecuritiesClearingProcess = relatedSecuritiesClearingProcess;
		return this;
	}
}