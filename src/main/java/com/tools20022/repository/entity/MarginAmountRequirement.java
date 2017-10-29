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
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#VariationMarginAmountRequirementCalculation
 * MarginAmountRequirement.VariationMarginAmountRequirementCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#DeliverMarginAmount
 * MarginAmountRequirement.DeliverMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#ReturnMarginAmount
 * MarginAmountRequirement.ReturnMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#SegregatedAmountRequirementCalculation
 * MarginAmountRequirement.SegregatedAmountRequirementCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#VariationMarginAmountRequirement
 * ExposureCalculation.VariationMarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#SegregatedAmountRequirement
 * ExposureCalculation.SegregatedAmountRequirement}</li>
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
 * "MarginAmountRequirement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of expected margin required by any of the parties of the margin calculation."
 * </li>
 * </ul>
 */
public class MarginAmountRequirement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exposure valuation which takes into account amount requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#VariationMarginAmountRequirement
	 * ExposureCalculation.VariationMarginAmountRequirement}</li>
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
	public static final MMBusinessAssociationEnd VariationMarginAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute DeliverMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverMarginAmount";
			definition = "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ReturnMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnMarginAmount";
			definition = "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Exposure valuation which takes into account amount requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#SegregatedAmountRequirement
	 * ExposureCalculation.SegregatedAmountRequirement}</li>
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
	public static final MMBusinessAssociationEnd SegregatedAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginAmountRequirement";
				definition = "Amount of expected margin required by any of the parties of the margin calculation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.DeliverMarginAmount,
						com.tools20022.repository.entity.MarginAmountRequirement.ReturnMarginAmount, com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}