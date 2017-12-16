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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Trigger that causes the variation to come into effect.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Trigger" src="doc-files/Trigger.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trigger#mmAutomaticVariation
 * Trigger.mmAutomaticVariation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trigger#mmTriggerDate
 * Trigger.mmTriggerDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trigger#mmTriggerEvent
 * Trigger.mmTriggerEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmTrigger
 * AutomaticVariation.mmTrigger}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trigger"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Trigger that causes the variation to come into effect."</li>
 * </ul>
 */
public class Trigger {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AutomaticVariation automaticVariation;
	/**
	 * Variation which was triggered by the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmTrigger
	 * AutomaticVariation.mmTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trigger
	 * Trigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variation which was triggered by the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAutomaticVariation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trigger.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticVariation";
			definition = "Variation which was triggered by the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmTrigger;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
		}
	};
	protected ISODate triggerDate;
	/**
	 * Date on which the variation comes into effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trigger
	 * Trigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggerDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the variation comes into effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTriggerDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trigger.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TriggerDate";
			definition = "Date on which the variation comes into effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Trigger.class.getMethod("getTriggerDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text triggerEvent;
	/**
	 * Event that causes the variation to come into effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trigger
	 * Trigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggerEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event that causes the variation to come into effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTriggerEvent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trigger.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TriggerEvent";
			definition = "Event that causes the variation to come into effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Trigger.class.getMethod("getTriggerEvent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trigger";
				definition = "Trigger that causes the variation to come into effect.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AutomaticVariation.mmTrigger);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trigger.mmAutomaticVariation, com.tools20022.repository.entity.Trigger.mmTriggerDate, com.tools20022.repository.entity.Trigger.mmTriggerEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Trigger.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AutomaticVariation getAutomaticVariation() {
		return automaticVariation;
	}

	public void setAutomaticVariation(com.tools20022.repository.entity.AutomaticVariation automaticVariation) {
		this.automaticVariation = automaticVariation;
	}

	public ISODate getTriggerDate() {
		return triggerDate;
	}

	public void setTriggerDate(ISODate triggerDate) {
		this.triggerDate = triggerDate;
	}

	public Max35Text getTriggerEvent() {
		return triggerEvent;
	}

	public void setTriggerEvent(Max35Text triggerEvent) {
		this.triggerEvent = triggerEvent;
	}
}