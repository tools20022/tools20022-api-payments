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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountRangeBoundary1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Limit for an amount range.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmountRangeBoundary" src="doc-files/AmountRangeBoundary.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmFromAmountRange
 * AmountRangeBoundary.mmFromAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmBoundaryAmount
 * AmountRangeBoundary.mmBoundaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmIncluded
 * AmountRangeBoundary.mmIncluded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmToAmountRange
 * AmountRangeBoundary.mmToAmountRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
 * AmountRange.mmFromAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
 * AmountRange.mmToAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
 * AmountRangeBoundary1}</li>
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
 * "AmountRangeBoundary"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Limit for an amount range."</li>
 * </ul>
 */
public class AmountRangeBoundary {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountRange fromAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
	 * AmountRange.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRange
	 * AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount range for which a lower boundary is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AmountRangeBoundary, AmountRange> mmFromAmountRange = new MMBusinessAssociationEnd<AmountRangeBoundary, AmountRange>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromAmountRange";
			definition = "Amount range for which a lower boundary is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRange.mmFromAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}

		@Override
		public AmountRange getValue(AmountRangeBoundary obj) {
			return obj.getFromAmountRange();
		}

		@Override
		public void setValue(AmountRangeBoundary obj, AmountRange value) {
			obj.setFromAmountRange(value);
		}
	};
	protected ImpliedCurrencyAndAmount boundaryAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1#mmBoundaryAmount
	 * AmountRangeBoundary1.mmBoundaryAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoundaryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount value of the range limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRangeBoundary, ImpliedCurrencyAndAmount> mmBoundaryAmount = new MMBusinessAttribute<AmountRangeBoundary, ImpliedCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountRangeBoundary1.mmBoundaryAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoundaryAmount";
			definition = "Amount value of the range limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(AmountRangeBoundary obj) {
			return obj.getBoundaryAmount();
		}

		@Override
		public void setValue(AmountRangeBoundary obj, ImpliedCurrencyAndAmount value) {
			obj.setBoundaryAmount(value);
		}
	};
	protected YesNoIndicator included;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1#mmIncluded
	 * AmountRangeBoundary1.mmIncluded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Included"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the boundary amount is included in the range of amount values."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AmountRangeBoundary, YesNoIndicator> mmIncluded = new MMBusinessAttribute<AmountRangeBoundary, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountRangeBoundary1.mmIncluded);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Included";
			definition = "Indicates whether the boundary amount is included in the range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AmountRangeBoundary obj) {
			return obj.getIncluded();
		}

		@Override
		public void setValue(AmountRangeBoundary obj, YesNoIndicator value) {
			obj.setIncluded(value);
		}
	};
	protected AmountRange toAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
	 * AmountRange.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRange
	 * AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount range for which an upper boundary is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AmountRangeBoundary, AmountRange> mmToAmountRange = new MMBusinessAssociationEnd<AmountRangeBoundary, AmountRange>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToAmountRange";
			definition = "Amount range for which an upper boundary is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRange.mmToAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}

		@Override
		public AmountRange getValue(AmountRangeBoundary obj) {
			return obj.getToAmountRange();
		}

		@Override
		public void setValue(AmountRangeBoundary obj, AmountRange value) {
			obj.setToAmountRange(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRangeBoundary";
				definition = "Limit for an amount range.";
				associationDomain_lazy = () -> Arrays.asList(AmountRange.mmFromAmount, AmountRange.mmToAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.mmFromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.mmBoundaryAmount,
						com.tools20022.repository.entity.AmountRangeBoundary.mmIncluded, com.tools20022.repository.entity.AmountRangeBoundary.mmToAmountRange);
				derivationComponent_lazy = () -> Arrays.asList(AmountRangeBoundary1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmountRangeBoundary.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRange getFromAmountRange() {
		return fromAmountRange;
	}

	public AmountRangeBoundary setFromAmountRange(AmountRange fromAmountRange) {
		this.fromAmountRange = Objects.requireNonNull(fromAmountRange);
		return this;
	}

	public ImpliedCurrencyAndAmount getBoundaryAmount() {
		return boundaryAmount;
	}

	public AmountRangeBoundary setBoundaryAmount(ImpliedCurrencyAndAmount boundaryAmount) {
		this.boundaryAmount = Objects.requireNonNull(boundaryAmount);
		return this;
	}

	public YesNoIndicator getIncluded() {
		return included;
	}

	public AmountRangeBoundary setIncluded(YesNoIndicator included) {
		this.included = Objects.requireNonNull(included);
		return this;
	}

	public AmountRange getToAmountRange() {
		return toAmountRange;
	}

	public AmountRangeBoundary setToAmountRange(AmountRange toAmountRange) {
		this.toAmountRange = Objects.requireNonNull(toAmountRange);
		return this;
	}
}