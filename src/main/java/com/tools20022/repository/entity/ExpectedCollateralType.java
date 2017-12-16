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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Call for which a variation margin type is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmVariationMarginRelatedCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedCall";
			definition = "Call for which a variation margin type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected CollateralTypeCode delivery;
	/**
	 * Type of collateral that will be delivered.
	 * <p>
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
	public static final MMBusinessAttribute mmDelivery = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return ExpectedCollateralType.class.getMethod("getDelivery", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralTypeCode return_;
	/**
	 * Type of collateral that will be returned.
	 * <p>
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
	public static final MMBusinessAttribute mmReturn = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return ExpectedCollateralType.class.getMethod("getReturn", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall segregatedIndependentAmountRelatedCall;
	/**
	 * Call for which a segregated independent amount type is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSegregatedIndependentAmountRelatedCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedCall";
			definition = "Call for which a segregated independent amount type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedCollateralType";
				definition = "Expected collateral type.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType);
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

	public MarginCall getVariationMarginRelatedCall() {
		return variationMarginRelatedCall;
	}

	public void setVariationMarginRelatedCall(com.tools20022.repository.entity.MarginCall variationMarginRelatedCall) {
		this.variationMarginRelatedCall = variationMarginRelatedCall;
	}

	public CollateralTypeCode getDelivery() {
		return delivery;
	}

	public void setDelivery(CollateralTypeCode delivery) {
		this.delivery = delivery;
	}

	public CollateralTypeCode getReturn() {
		return return_;
	}

	public void setReturn(CollateralTypeCode return_) {
		this.return_ = return_;
	}

	public MarginCall getSegregatedIndependentAmountRelatedCall() {
		return segregatedIndependentAmountRelatedCall;
	}

	public void setSegregatedIndependentAmountRelatedCall(com.tools20022.repository.entity.MarginCall segregatedIndependentAmountRelatedCall) {
		this.segregatedIndependentAmountRelatedCall = segregatedIndependentAmountRelatedCall;
	}
}