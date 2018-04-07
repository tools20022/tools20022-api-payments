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
import com.tools20022.repository.codeset.ChoiceCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationPeriod
 * ComponentSecurity.mmSeparationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSecurity
 * ComponentSecurity.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationChoice
 * ComponentSecurity.mmSeparationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmQuantityNumerator
 * ComponentSecurity.mmQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmQuantityDenominator
 * ComponentSecurity.mmQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationDate
 * ComponentSecurity.mmSeparationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmComponentSecurity
 * Security.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmComponentSecurity
 * DateTimePeriod.mmComponentSecurity}</li>
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
	protected DateTimePeriod separationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmComponentSecurity
	 * DateTimePeriod.mmComponentSecurity}</li>
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
	public static final MMBusinessAssociationEnd<ComponentSecurity, DateTimePeriod> mmSeparationPeriod = new MMBusinessAssociationEnd<ComponentSecurity, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeparationPeriod";
			definition = "Period during which the related security can (optional) or must (mandatory) be separated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmComponentSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(ComponentSecurity obj) {
			return obj.getSeparationPeriod();
		}

		@Override
		public void setValue(ComponentSecurity obj, DateTimePeriod value) {
			obj.setSeparationPeriod(value);
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmComponentSecurity
	 * Security.mmComponentSecurity}</li>
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
	public static final MMBusinessAssociationEnd<ComponentSecurity, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<ComponentSecurity, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a component security is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmComponentSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(ComponentSecurity obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(ComponentSecurity obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};
	protected ChoiceCode separationChoice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ComponentSecurity, ChoiceCode> mmSeparationChoice = new MMBusinessAttribute<ComponentSecurity, ChoiceCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeparationChoice";
			definition = " Defines if the separation of the security is optional or mandatory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}

		@Override
		public ChoiceCode getValue(ComponentSecurity obj) {
			return obj.getSeparationChoice();
		}

		@Override
		public void setValue(ComponentSecurity obj, ChoiceCode value) {
			obj.setSeparationChoice(value);
		}
	};
	protected BaseOneRate quantityNumerator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ComponentSecurity, BaseOneRate> mmQuantityNumerator = new MMBusinessAttribute<ComponentSecurity, BaseOneRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityNumerator";
			definition = "Number of related securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(ComponentSecurity obj) {
			return obj.getQuantityNumerator();
		}

		@Override
		public void setValue(ComponentSecurity obj, BaseOneRate value) {
			obj.setQuantityNumerator(value);
		}
	};
	protected BaseOneRate quantityDenominator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ComponentSecurity, BaseOneRate> mmQuantityDenominator = new MMBusinessAttribute<ComponentSecurity, BaseOneRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityDenominator";
			definition = "Number of held securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(ComponentSecurity obj) {
			return obj.getQuantityDenominator();
		}

		@Override
		public void setValue(ComponentSecurity obj, BaseOneRate value) {
			obj.setQuantityDenominator(value);
		}
	};
	protected ISODateTime separationDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<ComponentSecurity, ISODateTime> mmSeparationDate = new MMBusinessAttribute<ComponentSecurity, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeparationDate";
			definition = "Date/time at which the related security can (optional) or must (mandatory) be separated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ComponentSecurity obj) {
			return obj.getSeparationDate();
		}

		@Override
		public void setValue(ComponentSecurity obj, ISODateTime value) {
			obj.setSeparationDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ComponentSecurity";
				definition = "Security which forms a component of another security, for example, underlying.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmComponentSecurity, DateTimePeriod.mmComponentSecurity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ComponentSecurity.mmSeparationPeriod, com.tools20022.repository.entity.ComponentSecurity.mmSecurity,
						com.tools20022.repository.entity.ComponentSecurity.mmSeparationChoice, com.tools20022.repository.entity.ComponentSecurity.mmQuantityNumerator,
						com.tools20022.repository.entity.ComponentSecurity.mmQuantityDenominator, com.tools20022.repository.entity.ComponentSecurity.mmSeparationDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ComponentSecurity.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getSeparationPeriod() {
		return separationPeriod;
	}

	public ComponentSecurity setSeparationPeriod(DateTimePeriod separationPeriod) {
		this.separationPeriod = Objects.requireNonNull(separationPeriod);
		return this;
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public ComponentSecurity setSecurity(Security security) {
		this.security = security;
		return this;
	}

	public ChoiceCode getSeparationChoice() {
		return separationChoice;
	}

	public ComponentSecurity setSeparationChoice(ChoiceCode separationChoice) {
		this.separationChoice = Objects.requireNonNull(separationChoice);
		return this;
	}

	public BaseOneRate getQuantityNumerator() {
		return quantityNumerator;
	}

	public ComponentSecurity setQuantityNumerator(BaseOneRate quantityNumerator) {
		this.quantityNumerator = Objects.requireNonNull(quantityNumerator);
		return this;
	}

	public BaseOneRate getQuantityDenominator() {
		return quantityDenominator;
	}

	public ComponentSecurity setQuantityDenominator(BaseOneRate quantityDenominator) {
		this.quantityDenominator = Objects.requireNonNull(quantityDenominator);
		return this;
	}

	public ISODateTime getSeparationDate() {
		return separationDate;
	}

	public ComponentSecurity setSeparationDate(ISODateTime separationDate) {
		this.separationDate = Objects.requireNonNull(separationDate);
		return this;
	}
}