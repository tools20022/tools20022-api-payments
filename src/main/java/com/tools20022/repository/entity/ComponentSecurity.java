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
import com.tools20022.repository.codeset.ChoiceCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security which forms a component of another security, for example,
 * underlying.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ComponentSecurity" src="doc-files/ComponentSecurity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#SeparationPeriod
 * ComponentSecurity.SeparationPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ComponentSecurity#Security
 * ComponentSecurity.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#SeparationChoice
 * ComponentSecurity.SeparationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#QuantityNumerator
 * ComponentSecurity.QuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#QuantityDenominator
 * ComponentSecurity.QuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#SeparationDate
 * ComponentSecurity.SeparationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#ComponentSecurity
 * Security.ComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ComponentSecurity
 * DateTimePeriod.ComponentSecurity}</li>
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
 * "ComponentSecurity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security which forms a component of another security, for example, underlying."
 * </li>
 * </ul>
 */
public class ComponentSecurity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the related security can (optional) or must
	 * (mandatory) be separated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ComponentSecurity
	 * DateTimePeriod.ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeparationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the related security can (optional) or must (mandatory) be separated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SeparationPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationPeriod";
			definition = "Period during which the related security can (optional) or must (mandatory) be separated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a component security is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#ComponentSecurity
	 * Security.ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a component security is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a component security is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.ComponentSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines if the separation of the security is optional or mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ChoiceCode
	 * ChoiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeparationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Defines if the separation of the security is optional or mandatory."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SeparationChoice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationChoice";
			definition = " Defines if the separation of the security is optional or mandatory.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}
	};
	/**
	 * Number of related securities for the exercise.
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
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of related securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuantityNumerator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityNumerator";
			definition = "Number of related securities for the exercise.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Number of held securities for the exercise.
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
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuantityDenominator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityDenominator";
			definition = "Number of held securities for the exercise.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Date/time at which the related security can (optional) or must
	 * (mandatory) be separated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeparationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the related security can (optional) or must (mandatory) be separated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SeparationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ComponentSecurity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparationDate";
			definition = "Date/time at which the related security can (optional) or must (mandatory) be separated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ComponentSecurity";
				definition = "Security which forms a component of another security, for example, underlying.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.ComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod, com.tools20022.repository.entity.ComponentSecurity.Security,
						com.tools20022.repository.entity.ComponentSecurity.SeparationChoice, com.tools20022.repository.entity.ComponentSecurity.QuantityNumerator, com.tools20022.repository.entity.ComponentSecurity.QuantityDenominator,
						com.tools20022.repository.entity.ComponentSecurity.SeparationDate);
			}
		});
		return mmObject_lazy.get();
	}
}