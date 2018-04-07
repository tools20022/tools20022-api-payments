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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FrequencyAndMoment1;
import com.tools20022.repository.msg.FrequencyPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for a frequency, for example, the frequency of payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Frequency36Choice#mmType
 * Frequency36Choice.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Frequency36Choice#mmPeriod
 * Frequency36Choice.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Frequency36Choice#mmPointInTime
 * Frequency36Choice.mmPointInTime}</li>
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
 * "Frequency36Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of format for a frequency, for example, the frequency of payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Frequency36Choice", propOrder = {"type", "period", "pointInTime"})
public class Frequency36Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected Frequency6Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency6Code
	 * Frequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Frequency36Choice
	 * Frequency36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a frequency in terms of a specified period type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Frequency36Choice, Frequency6Code> mmType = new MMMessageAttribute<Frequency36Choice, Frequency6Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies a frequency in terms of a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}

		@Override
		public Frequency6Code getValue(Frequency36Choice obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Frequency36Choice obj, Frequency6Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Prd", required = true)
	protected FrequencyPeriod1 period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FrequencyPeriod1
	 * FrequencyPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Frequency36Choice
	 * Frequency36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a frequency in terms of a count per period within a specified period type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Frequency36Choice, FrequencyPeriod1> mmPeriod = new MMMessageAttribute<Frequency36Choice, FrequencyPeriod1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Specifies a frequency in terms of a count per period within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FrequencyPeriod1.mmObject();
		}

		@Override
		public FrequencyPeriod1 getValue(Frequency36Choice obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(Frequency36Choice obj, FrequencyPeriod1 value) {
			obj.setPeriod(value);
		}
	};
	@XmlElement(name = "PtInTm", required = true)
	protected FrequencyAndMoment1 pointInTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FrequencyAndMoment1
	 * FrequencyAndMoment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Frequency36Choice
	 * Frequency36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtInTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointInTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a frequency in terms of an exact point in time or moment within a specified period type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Frequency36Choice, FrequencyAndMoment1> mmPointInTime = new MMMessageAssociationEnd<Frequency36Choice, FrequencyAndMoment1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "PtInTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FrequencyAndMoment1.mmObject();
		}

		@Override
		public FrequencyAndMoment1 getValue(Frequency36Choice obj) {
			return obj.getPointInTime();
		}

		@Override
		public void setValue(Frequency36Choice obj, FrequencyAndMoment1 value) {
			obj.setPointInTime(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Frequency36Choice.mmType, com.tools20022.repository.choice.Frequency36Choice.mmPeriod,
						com.tools20022.repository.choice.Frequency36Choice.mmPointInTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Frequency36Choice";
				definition = "Choice of format for a frequency, for example, the frequency of payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency6Code getType() {
		return type;
	}

	public Frequency36Choice setType(Frequency6Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public FrequencyPeriod1 getPeriod() {
		return period;
	}

	public Frequency36Choice setPeriod(FrequencyPeriod1 period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public FrequencyAndMoment1 getPointInTime() {
		return pointInTime;
	}

	public Frequency36Choice setPointInTime(FrequencyAndMoment1 pointInTime) {
		this.pointInTime = Objects.requireNonNull(pointInTime);
		return this;
	}
}