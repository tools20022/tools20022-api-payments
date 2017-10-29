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
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the amount of a premium on a currency option together with its
 * calculation method.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PremiumCalculation" src="doc-files/PremiumCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PremiumCalculation#Option
 * PremiumCalculation.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#PercentageOfCallAmount
 * PremiumCalculation.PercentageOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#PercentageOfPutAmount
 * PremiumCalculation.PercentageOfPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#PointsOfCallAmount
 * PremiumCalculation.PointsOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#PointsOfPutAmount
 * PremiumCalculation.PointsOfPutAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumCalculation
 * CurrencyOption.PremiumCalculation}</li>
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
 * "PremiumCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the amount of a premium on a currency option together with its calculation method."
 * </li>
 * </ul>
 */
public class PremiumCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option for which a premium is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumCalculation
	 * CurrencyOption.PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which a premium is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a premium is calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.PremiumCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Premium calculation is based on a percentage of the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the call amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageOfCallAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfCallAmount";
			definition = "Premium calculation is based on a percentage of the call amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on a percentage of the put amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the put amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageOfPutAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPutAmount";
			definition = "Premium calculation is based on a percentage of the put amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on points of the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on points of the call amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PointsOfCallAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfCallAmount";
			definition = "Premium calculation is based on points of the call amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on points of the put amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium calculation is based on points of the put amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PointsOfPutAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfPutAmount";
			definition = "Premium calculation is based on points of the put amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PremiumCalculation";
				definition = "Specifies the amount of a premium on a currency option together with its calculation method.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.PremiumCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PremiumCalculation.Option, com.tools20022.repository.entity.PremiumCalculation.PercentageOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.PercentageOfPutAmount, com.tools20022.repository.entity.PremiumCalculation.PointsOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.PointsOfPutAmount);
			}
		});
		return mmObject_lazy.get();
	}
}