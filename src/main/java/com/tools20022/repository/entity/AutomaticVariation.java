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
import com.tools20022.repository.codeset.VariationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Trigger;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Predefined variations that may be attributable to an undertaking such as a
 * guarantee or standby letter of credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AutomaticVariation" src="doc-files/AutomaticVariation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
 * AutomaticVariation.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AutomaticVariation#mmType
 * AutomaticVariation.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmVariationAmount
 * AutomaticVariation.mmVariationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmTrigger
 * AutomaticVariation.mmTrigger}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
 * Undertaking.mmPredefinedVariation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trigger#mmAutomaticVariation
 * Trigger.mmAutomaticVariation}</li>
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
 * "AutomaticVariation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Predefined variations that may be attributable to an undertaking such as a guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class AutomaticVariation {

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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
	 * Undertaking.mmPredefinedVariation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking for which a predefined variation is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AutomaticVariation, Undertaking> mmUndertaking = new MMBusinessAssociationEnd<AutomaticVariation, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a predefined variation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmPredefinedVariation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(AutomaticVariation obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(AutomaticVariation obj, Undertaking value) {
			obj.setUndertaking(value);
		}
	};
	protected VariationTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VariationTypeCode
	 * VariationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of predefined variation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AutomaticVariation, VariationTypeCode> mmType = new MMBusinessAttribute<AutomaticVariation, VariationTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of predefined variation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VariationTypeCode.mmObject();
		}

		@Override
		public VariationTypeCode getValue(AutomaticVariation obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AutomaticVariation obj, VariationTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount variationAmount;
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
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variation specified as a monetary amount increase or decrease to the undertaking amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AutomaticVariation, CurrencyAndAmount> mmVariationAmount = new MMBusinessAttribute<AutomaticVariation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationAmount";
			definition = "Variation specified as a monetary amount increase or decrease to the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AutomaticVariation obj) {
			return obj.getVariationAmount();
		}

		@Override
		public void setValue(AutomaticVariation obj, CurrencyAndAmount value) {
			obj.setVariationAmount(value);
		}
	};
	protected Trigger trigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trigger#mmAutomaticVariation
	 * Trigger.mmAutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trigger Trigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger that causes the variation to come into effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AutomaticVariation, Optional<Trigger>> mmTrigger = new MMBusinessAssociationEnd<AutomaticVariation, Optional<Trigger>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Trigger that causes the variation to come into effect.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Trigger.mmAutomaticVariation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trigger.mmObject();
		}

		@Override
		public Optional<Trigger> getValue(AutomaticVariation obj) {
			return obj.getTrigger();
		}

		@Override
		public void setValue(AutomaticVariation obj, Optional<Trigger> value) {
			obj.setTrigger(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutomaticVariation";
				definition = "Predefined variations that may be attributable to an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(Undertaking.mmPredefinedVariation, Trigger.mmAutomaticVariation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AutomaticVariation.mmUndertaking, com.tools20022.repository.entity.AutomaticVariation.mmType,
						com.tools20022.repository.entity.AutomaticVariation.mmVariationAmount, com.tools20022.repository.entity.AutomaticVariation.mmTrigger);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AutomaticVariation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public AutomaticVariation setUndertaking(Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public VariationTypeCode getType() {
		return type;
	}

	public AutomaticVariation setType(VariationTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getVariationAmount() {
		return variationAmount;
	}

	public AutomaticVariation setVariationAmount(CurrencyAndAmount variationAmount) {
		this.variationAmount = Objects.requireNonNull(variationAmount);
		return this;
	}

	public Optional<Trigger> getTrigger() {
		return trigger == null ? Optional.empty() : Optional.of(trigger);
	}

	public AutomaticVariation setTrigger(Trigger trigger) {
		this.trigger = trigger;
		return this;
	}
}