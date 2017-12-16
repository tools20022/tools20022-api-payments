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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of expected margin required by any of the parties of the margin
 * calculation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarginAmountRequirement"
 * src="doc-files/MarginAmountRequirement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmVariationMarginAmountRequirementCalculation
 * MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmDeliverMarginAmount
 * MarginAmountRequirement.mmDeliverMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmReturnMarginAmount
 * MarginAmountRequirement.mmReturnMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmSegregatedAmountRequirementCalculation
 * MarginAmountRequirement.mmSegregatedAmountRequirementCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
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
 * "MarginAmountRequirement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of expected margin required by any of the parties of the margin calculation."
 * </li>
 * </ul>
 */
public class MarginAmountRequirement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExposureCalculation variationMarginAmountRequirementCalculation;
	/**
	 * Exposure valuation which takes into account amount requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
	 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAmountRequirementCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exposure valuation which takes into account amount requirements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariationMarginAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmVariationMarginAmountRequirement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount deliverMarginAmount;
	/**
	 * Amount of new Variation Margin that will be delivered to one party by the
	 * other party after rounding, threshold and minimum transfer amount are
	 * taken into account.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeliverMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverMarginAmount";
			definition = "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginAmountRequirement.class.getMethod("getDeliverMarginAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount returnMarginAmount;
	/**
	 * Amount of new Variation Margin that will be recalled to one party from
	 * the other party after rounding, threshold and minimum transfer amount are
	 * taken into account.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReturnMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnMarginAmount";
			definition = "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginAmountRequirement.class.getMethod("getReturnMarginAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExposureCalculation segregatedAmountRequirementCalculation;
	/**
	 * Exposure valuation which takes into account amount requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
	 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
	 * MarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedAmountRequirementCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exposure valuation which takes into account amount requirements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSegregatedAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmSegregatedAmountRequirement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginAmountRequirement";
				definition = "Amount of expected margin required by any of the parties of the margin calculation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.mmVariationMarginAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.mmSegregatedAmountRequirement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginAmountRequirement.mmVariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.mmDeliverMarginAmount,
						com.tools20022.repository.entity.MarginAmountRequirement.mmReturnMarginAmount, com.tools20022.repository.entity.MarginAmountRequirement.mmSegregatedAmountRequirementCalculation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginAmountRequirement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExposureCalculation getVariationMarginAmountRequirementCalculation() {
		return variationMarginAmountRequirementCalculation;
	}

	public void setVariationMarginAmountRequirementCalculation(com.tools20022.repository.entity.ExposureCalculation variationMarginAmountRequirementCalculation) {
		this.variationMarginAmountRequirementCalculation = variationMarginAmountRequirementCalculation;
	}

	public ActiveCurrencyAndAmount getDeliverMarginAmount() {
		return deliverMarginAmount;
	}

	public void setDeliverMarginAmount(ActiveCurrencyAndAmount deliverMarginAmount) {
		this.deliverMarginAmount = deliverMarginAmount;
	}

	public ActiveCurrencyAndAmount getReturnMarginAmount() {
		return returnMarginAmount;
	}

	public void setReturnMarginAmount(ActiveCurrencyAndAmount returnMarginAmount) {
		this.returnMarginAmount = returnMarginAmount;
	}

	public ExposureCalculation getSegregatedAmountRequirementCalculation() {
		return segregatedAmountRequirementCalculation;
	}

	public void setSegregatedAmountRequirementCalculation(com.tools20022.repository.entity.ExposureCalculation segregatedAmountRequirementCalculation) {
		this.segregatedAmountRequirementCalculation = segregatedAmountRequirementCalculation;
	}
}