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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.SecuritiesClearing;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Offset of payables against receivables to reduce credit exposure to a
 * counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Netting" src="doc-files/Netting.svg">
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
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmAverageDealPrice
 * Netting.mmAverageDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Netting#mmRelatedSecuritiesClearingProcess
 * Netting.mmRelatedSecuritiesClearingProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmNetPositionAmount
 * Netting.mmNetPositionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmAmountDirection
 * Netting.mmAmountDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmNetQuantity
 * Netting.mmNetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmPositionAmount
 * Netting.mmPositionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetting
 * SecuritiesQuantity.mmNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetting
 * Price.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNetting
 * SecuritiesClearing.mmNetting}</li>
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
 * "Netting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Offset of payables against receivables to reduce credit exposure to a counterparty."
 * </li>
 * </ul>
 */
public class Netting extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Price> averageDealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#mmNetting
	 * Price.mmNetting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageDealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Average price of the netted trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Netting, List<Price>> mmAverageDealPrice = new MMBusinessAssociationEnd<Netting, List<Price>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AverageDealPrice";
			definition = "Average price of the netted trades.";
			minOccurs = 0;
			opposite_lazy = () -> Price.mmNetting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public List<Price> getValue(Netting obj) {
			return obj.getAverageDealPrice();
		}

		@Override
		public void setValue(Netting obj, List<Price> value) {
			obj.setAverageDealPrice(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNetting
	 * SecuritiesClearing.mmNetting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesClearingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process which includes the netting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Netting, Optional<SecuritiesClearing>> mmRelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd<Netting, Optional<SecuritiesClearing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the netting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesClearing.mmNetting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesClearing.mmObject();
		}

		@Override
		public Optional<SecuritiesClearing> getValue(Netting obj) {
			return obj.getRelatedSecuritiesClearingProcess();
		}

		@Override
		public void setValue(Netting obj, Optional<SecuritiesClearing> value) {
			obj.setRelatedSecuritiesClearingProcess(value.orElse(null));
		}
	};
	protected ActiveCurrencyAndAmount netPositionAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated position."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Netting, ActiveCurrencyAndAmount> mmNetPositionAmount = new MMBusinessAttribute<Netting, ActiveCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPositionAmount";
			definition = "Calculated position.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Netting obj) {
			return obj.getNetPositionAmount();
		}

		@Override
		public void setValue(Netting obj, ActiveCurrencyAndAmount value) {
			obj.setNetPositionAmount(value);
		}
	};
	protected DebitCreditCode amountDirection;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the amount is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Netting, DebitCreditCode> mmAmountDirection = new MMBusinessAttribute<Netting, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Netting obj) {
			return obj.getAmountDirection();
		}

		@Override
		public void setValue(Netting obj, DebitCreditCode value) {
			obj.setAmountDirection(value);
		}
	};
	protected SecuritiesQuantity netQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetting
	 * SecuritiesQuantity.mmNetting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated net quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Netting, SecuritiesQuantity> mmNetQuantity = new MMBusinessAssociationEnd<Netting, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetQuantity";
			definition = "Calculated net quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmNetting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Netting obj) {
			return obj.getNetQuantity();
		}

		@Override
		public void setValue(Netting obj, SecuritiesQuantity value) {
			obj.setNetQuantity(value);
		}
	};
	protected CurrencyAndAmount positionAmount;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Netting
	 * Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intra-position amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Netting, CurrencyAndAmount> mmPositionAmount = new MMBusinessAttribute<Netting, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PositionAmount";
			definition = "Intra-position amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Netting obj) {
			return obj.getPositionAmount();
		}

		@Override
		public void setValue(Netting obj, CurrencyAndAmount value) {
			obj.setPositionAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Netting";
				definition = "Offset of payables against receivables to reduce credit exposure to a counterparty.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesQuantity.mmNetting, Price.mmNetting, SecuritiesClearing.mmNetting);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Netting.mmAverageDealPrice, com.tools20022.repository.entity.Netting.mmRelatedSecuritiesClearingProcess,
						com.tools20022.repository.entity.Netting.mmNetPositionAmount, com.tools20022.repository.entity.Netting.mmAmountDirection, com.tools20022.repository.entity.Netting.mmNetQuantity,
						com.tools20022.repository.entity.Netting.mmPositionAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Netting.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Price> getAverageDealPrice() {
		return averageDealPrice == null ? averageDealPrice = new ArrayList<>() : averageDealPrice;
	}

	public Netting setAverageDealPrice(List<Price> averageDealPrice) {
		this.averageDealPrice = Objects.requireNonNull(averageDealPrice);
		return this;
	}

	public Optional<SecuritiesClearing> getRelatedSecuritiesClearingProcess() {
		return relatedSecuritiesClearingProcess == null ? Optional.empty() : Optional.of(relatedSecuritiesClearingProcess);
	}

	public Netting setRelatedSecuritiesClearingProcess(SecuritiesClearing relatedSecuritiesClearingProcess) {
		this.relatedSecuritiesClearingProcess = relatedSecuritiesClearingProcess;
		return this;
	}

	public ActiveCurrencyAndAmount getNetPositionAmount() {
		return netPositionAmount;
	}

	public Netting setNetPositionAmount(ActiveCurrencyAndAmount netPositionAmount) {
		this.netPositionAmount = Objects.requireNonNull(netPositionAmount);
		return this;
	}

	public DebitCreditCode getAmountDirection() {
		return amountDirection;
	}

	public Netting setAmountDirection(DebitCreditCode amountDirection) {
		this.amountDirection = Objects.requireNonNull(amountDirection);
		return this;
	}

	public SecuritiesQuantity getNetQuantity() {
		return netQuantity;
	}

	public Netting setNetQuantity(SecuritiesQuantity netQuantity) {
		this.netQuantity = Objects.requireNonNull(netQuantity);
		return this;
	}

	public CurrencyAndAmount getPositionAmount() {
		return positionAmount;
	}

	public Netting setPositionAmount(CurrencyAndAmount positionAmount) {
		this.positionAmount = Objects.requireNonNull(positionAmount);
		return this;
	}
}