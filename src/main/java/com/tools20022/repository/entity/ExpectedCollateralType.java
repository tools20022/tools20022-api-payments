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
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Expected collateral type.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExpectedCollateralType"
 * src="doc-files/ExpectedCollateralType.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmDelivery
 * ExpectedCollateralType.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmReturn
 * ExpectedCollateralType.mmReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
 * MarginCall.mmExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpectedCollateralType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expected collateral type."</li>
 * </ul>
 */
public class ExpectedCollateralType {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MarginCall variationMarginRelatedCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
	 * MarginCall.mmExpectedVariationMarginType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Call for which a variation margin type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExpectedCollateralType, Optional<MarginCall>> mmVariationMarginRelatedCall = new MMBusinessAssociationEnd<ExpectedCollateralType, Optional<MarginCall>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedCall";
			definition = "Call for which a variation margin type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MarginCall.mmExpectedVariationMarginType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}

		@Override
		public Optional<MarginCall> getValue(ExpectedCollateralType obj) {
			return obj.getVariationMarginRelatedCall();
		}

		@Override
		public void setValue(ExpectedCollateralType obj, Optional<MarginCall> value) {
			obj.setVariationMarginRelatedCall(value.orElse(null));
		}
	};
	protected CollateralTypeCode delivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExpectedCollateralType, CollateralTypeCode> mmDelivery = new MMBusinessAttribute<ExpectedCollateralType, CollateralTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}

		@Override
		public CollateralTypeCode getValue(ExpectedCollateralType obj) {
			return obj.getDelivery();
		}

		@Override
		public void setValue(ExpectedCollateralType obj, CollateralTypeCode value) {
			obj.setDelivery(value);
		}
	};
	protected CollateralTypeCode return_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ExpectedCollateralType, CollateralTypeCode> mmReturn = new MMBusinessAttribute<ExpectedCollateralType, CollateralTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}

		@Override
		public CollateralTypeCode getValue(ExpectedCollateralType obj) {
			return obj.getReturn();
		}

		@Override
		public void setValue(ExpectedCollateralType obj, CollateralTypeCode value) {
			obj.setReturn(value);
		}
	};
	protected MarginCall segregatedIndependentAmountRelatedCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
	 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call for which a segregated independent amount type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExpectedCollateralType, Optional<MarginCall>> mmSegregatedIndependentAmountRelatedCall = new MMBusinessAssociationEnd<ExpectedCollateralType, Optional<MarginCall>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedCall";
			definition = "Call for which a segregated independent amount type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MarginCall.mmExpectedSegregatedIndependentAmountType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}

		@Override
		public Optional<MarginCall> getValue(ExpectedCollateralType obj) {
			return obj.getSegregatedIndependentAmountRelatedCall();
		}

		@Override
		public void setValue(ExpectedCollateralType obj, Optional<MarginCall> value) {
			obj.setSegregatedIndependentAmountRelatedCall(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedCollateralType";
				definition = "Expected collateral type.";
				associationDomain_lazy = () -> Arrays.asList(MarginCall.mmExpectedVariationMarginType, MarginCall.mmExpectedSegregatedIndependentAmountType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExpectedCollateralType.mmVariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.mmDelivery,
						com.tools20022.repository.entity.ExpectedCollateralType.mmReturn, com.tools20022.repository.entity.ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExpectedCollateralType.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MarginCall> getVariationMarginRelatedCall() {
		return variationMarginRelatedCall == null ? Optional.empty() : Optional.of(variationMarginRelatedCall);
	}

	public ExpectedCollateralType setVariationMarginRelatedCall(MarginCall variationMarginRelatedCall) {
		this.variationMarginRelatedCall = variationMarginRelatedCall;
		return this;
	}

	public CollateralTypeCode getDelivery() {
		return delivery;
	}

	public ExpectedCollateralType setDelivery(CollateralTypeCode delivery) {
		this.delivery = Objects.requireNonNull(delivery);
		return this;
	}

	public CollateralTypeCode getReturn() {
		return return_;
	}

	public ExpectedCollateralType setReturn(CollateralTypeCode return_) {
		this.return_ = Objects.requireNonNull(return_);
		return this;
	}

	public Optional<MarginCall> getSegregatedIndependentAmountRelatedCall() {
		return segregatedIndependentAmountRelatedCall == null ? Optional.empty() : Optional.of(segregatedIndependentAmountRelatedCall);
	}

	public ExpectedCollateralType setSegregatedIndependentAmountRelatedCall(MarginCall segregatedIndependentAmountRelatedCall) {
		this.segregatedIndependentAmountRelatedCall = segregatedIndependentAmountRelatedCall;
		return this;
	}
}