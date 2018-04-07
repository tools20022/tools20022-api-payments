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
import com.tools20022.repository.codeset.AmountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.Tolerance;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Amount of an undertaking such as a guarantee or standby letter of credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingAmount" src="doc-files/UndertakingAmount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmUndertaking
 * UndertakingAmount.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingAmount#mmAmount
 * UndertakingAmount.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmTolerance
 * UndertakingAmount.mmTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmBalanceAmount
 * UndertakingAmount.mmBalanceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingAmount#mmType
 * UndertakingAmount.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
 * UndertakingAmount.mmInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
 * Interest.mmRelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
 * Undertaking.mmUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tolerance#mmRelatedUndertakingAmount
 * Tolerance.mmRelatedUndertakingAmount}</li>
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
 * "UndertakingAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of an undertaking such as a guarantee or standby letter of credit."</li>
 * </ul>
 */
public class UndertakingAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which an amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingAmount, Undertaking> mmUndertaking = new MMBusinessAssociationEnd<UndertakingAmount, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which an amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmUndertakingAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(UndertakingAmount obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(UndertakingAmount obj, Undertaking value) {
			obj.setUndertaking(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingAmount, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<UndertakingAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(UndertakingAmount obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(UndertakingAmount obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Tolerance tolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#mmRelatedUndertakingAmount
	 * Tolerance.mmRelatedUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tolerance Tolerance}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage (original or updated in case of amendment) by which the amount claimed under the undertaking may vary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingAmount, Tolerance> mmTolerance = new MMBusinessAssociationEnd<UndertakingAmount, Tolerance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tolerance";
			definition = "Percentage (original or updated in case of amendment) by which the amount claimed under the undertaking may vary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tolerance.mmRelatedUndertakingAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tolerance.mmObject();
		}

		@Override
		public Tolerance getValue(UndertakingAmount obj) {
			return obj.getTolerance();
		}

		@Override
		public void setValue(UndertakingAmount obj, Tolerance value) {
			obj.setTolerance(value);
		}
	};
	protected CurrencyAndAmount balanceAmount;
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
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculated undertaking available balance amount resulting from the application of the variation amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingAmount, CurrencyAndAmount> mmBalanceAmount = new MMBusinessAttribute<UndertakingAmount, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceAmount";
			definition = "Calculated undertaking available balance amount resulting from the application of the variation amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(UndertakingAmount obj) {
			return obj.getBalanceAmount();
		}

		@Override
		public void setValue(UndertakingAmount obj, CurrencyAndAmount value) {
			obj.setBalanceAmount(value);
		}
	};
	protected AmountTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualification of the costs and other amounts covered by the amount of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingAmount, AmountTypeCode> mmType = new MMBusinessAttribute<UndertakingAmount, AmountTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Qualification of the costs and other amounts covered by the amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountTypeCode.mmObject();
		}

		@Override
		public AmountTypeCode getValue(UndertakingAmount obj) {
			return obj.getType();
		}

		@Override
		public void setValue(UndertakingAmount obj, AmountTypeCode value) {
			obj.setType(value);
		}
	};
	protected Interest interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
	 * Interest.mmRelatedUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest associated with the undertaking amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingAmount, Interest> mmInterest = new MMBusinessAssociationEnd<UndertakingAmount, Interest>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest associated with the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Interest.mmRelatedUndertakingAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public Interest getValue(UndertakingAmount obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(UndertakingAmount obj, Interest value) {
			obj.setInterest(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAmount";
				definition = "Amount of an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(Interest.mmRelatedUndertakingAmount, Undertaking.mmUndertakingAmount, Tolerance.mmRelatedUndertakingAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingAmount.mmUndertaking, com.tools20022.repository.entity.UndertakingAmount.mmAmount,
						com.tools20022.repository.entity.UndertakingAmount.mmTolerance, com.tools20022.repository.entity.UndertakingAmount.mmBalanceAmount, com.tools20022.repository.entity.UndertakingAmount.mmType,
						com.tools20022.repository.entity.UndertakingAmount.mmInterest);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingAmount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public UndertakingAmount setUndertaking(Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public UndertakingAmount setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Tolerance getTolerance() {
		return tolerance;
	}

	public UndertakingAmount setTolerance(Tolerance tolerance) {
		this.tolerance = Objects.requireNonNull(tolerance);
		return this;
	}

	public CurrencyAndAmount getBalanceAmount() {
		return balanceAmount;
	}

	public UndertakingAmount setBalanceAmount(CurrencyAndAmount balanceAmount) {
		this.balanceAmount = Objects.requireNonNull(balanceAmount);
		return this;
	}

	public AmountTypeCode getType() {
		return type;
	}

	public UndertakingAmount setType(AmountTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Interest getInterest() {
		return interest;
	}

	public UndertakingAmount setInterest(Interest interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}
}